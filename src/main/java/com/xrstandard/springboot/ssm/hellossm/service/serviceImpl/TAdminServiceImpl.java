package com.xrstandard.springboot.ssm.hellossm.service.serviceImpl;

import com.xrstandard.springboot.ssm.hellossm.bean.TAdmin;
import com.xrstandard.springboot.ssm.hellossm.mapper.TAdminMapper;
import com.xrstandard.springboot.ssm.hellossm.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    TAdminMapper tAdminMapper;

    @Override
    public TAdmin getTAdmin(Integer id) {
        return tAdminMapper.selectByPrimaryKey(id);
    }
}
