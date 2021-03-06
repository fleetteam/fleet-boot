package org.fleet.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.fleet.modules.system.entity.SysAnnouncementSend;
import org.fleet.modules.system.mapper.SysAnnouncementSendMapper;
import org.fleet.modules.system.model.AnnouncementSendModel;
import org.fleet.modules.system.service.ISysAnnouncementSendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 用户通告阅读标记表
 * @Author: fleet-team
 * @Date: 2021-04-19
 * @Version: V1.0
 */
@Service
public class SysAnnouncementSendServiceImpl extends ServiceImpl<SysAnnouncementSendMapper, SysAnnouncementSend> implements ISysAnnouncementSendService {

    @Resource
    private SysAnnouncementSendMapper sysAnnouncementSendMapper;

    @Override
    public List<String> queryByUserId(String userId) {
        return sysAnnouncementSendMapper.queryByUserId(userId);
    }

    @Override
    public Page<AnnouncementSendModel> getMyAnnouncementSendPage(Page<AnnouncementSendModel> page,
                                                                 AnnouncementSendModel announcementSendModel) {
        return page.setRecords(sysAnnouncementSendMapper.getMyAnnouncementSendList(page, announcementSendModel));
    }

}
