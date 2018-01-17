package isa.qa.senior.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import isa.qa.senior.core.Result;
import isa.qa.senior.core.ResultGenerator;
import isa.qa.senior.domain.RoleDO;
import isa.qa.senior.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jinhuaquan
 * @create 2017-12-08 下午5:15
 * @desc user controller层
 **/
@RequestMapping(value = "/api")
@RestController
public class RoleController {

    @Resource
    private RoleService roleService;


    @ApiOperation(value="保存RoleDO", notes="新增一个RoleDO")
    @ApiImplicitParam(name = "RoleDO", value = "实体RoleDO", required = true, dataType = "RoleDO")
    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    public Result saveRole(@RequestBody RoleDO roleDO) {
        roleService.saveRole(roleDO);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value="根据id删除roleDO", notes="根据url中的id来指定删除roleDO对象")
    @ApiImplicitParam(name = "id", value = "roleDO的id", required = true, dataType = "Long")
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.DELETE)
    public Result deleteRole(@PathVariable Long id) {
        roleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value="更新role信息", notes="根据url中的id来指定更新对象，并根据传过来的role信息来更新role详细信息")
    @ApiImplicitParams({
                           @ApiImplicitParam(name = "id", value = "roleDO的id", required = true, dataType = "Long"),
                           @ApiImplicitParam(name = "role", value = "实体roleDO", required = true, dataType = "role")
    })
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.PUT)
    public Result updateRole(@PathVariable Long id, @RequestBody RoleDO roleDO) {
        roleService.updateRole(roleDO);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value="根据id查询RoleDO", notes="根据url中的id来获取RoleDO")
    @ApiImplicitParam(name = "id", value = "RoleDO的id", required = true, dataType = "Long")
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
    public Result getRole(@PathVariable Long id) {
        RoleDO roleDO = roleService.findById(id);
        return ResultGenerator.genSuccessResult(roleDO);
    }

    @ApiOperation(value="获取RoleDO列表", notes="分页查询RoleDO列表")
    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public Result listRole(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RoleDO> roleDOList = roleService.findAll();
        PageInfo pageInfo = new PageInfo(roleDOList);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
