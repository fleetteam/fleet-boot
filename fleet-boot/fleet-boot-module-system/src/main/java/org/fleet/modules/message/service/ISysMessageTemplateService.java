package org.fleet.modules.message.service;

import org.fleet.common.system.base.service.FleetService;
import org.fleet.modules.message.entity.SysMessageTemplate;

import java.util.List;

/**
 * @Description: 消息模板
 * @Author: fleet-team
 * @Date: 2021-04-19
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends FleetService<SysMessageTemplate> {
    List<SysMessageTemplate> selectByCode(String code);
}
