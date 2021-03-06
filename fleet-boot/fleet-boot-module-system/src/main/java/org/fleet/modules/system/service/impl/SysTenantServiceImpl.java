package org.fleet.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.fleet.modules.system.entity.SysTenant;
import org.fleet.modules.system.mapper.SysTenantMapper;
import org.fleet.modules.system.service.ISysTenantService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SysTenantServiceImpl extends ServiceImpl<SysTenantMapper, SysTenant> implements ISysTenantService {

}
