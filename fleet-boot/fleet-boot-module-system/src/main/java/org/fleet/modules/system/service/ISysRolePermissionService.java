package org.fleet.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fleet.modules.system.entity.SysRolePermission;

/**
 * <p>
 * 角色权限表 服务类
 * </p>
 *
 * @Author fleet-team
 * @since 2021-04-19
 */
public interface ISysRolePermissionService extends IService<SysRolePermission> {

    /**
     * 保存授权/先删后增
     *
     * @param roleId
     * @param permissionIds
     */
    public void saveRolePermission(String roleId, String permissionIds);

    /**
     * 保存授权 将上次的权限和这次作比较 差异处理提高效率
     *
     * @param roleId
     * @param permissionIds
     * @param lastPermissionIds
     */
    public void saveRolePermission(String roleId, String permissionIds, String lastPermissionIds);

}
