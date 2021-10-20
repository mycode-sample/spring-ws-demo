package com.mycompany.hr.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HumanResourceServiceImpl implements HumanResourceService {
    private static final Logger log = LoggerFactory.getLogger(HumanResourceServiceImpl.class);
    @Override
    public void bookHoliday(Date startDate, Date endDate, String name) {
        log.info("开始日期:" + startDate);
        log.info("结束日期:" + endDate);
        log.info("用户:" + name);
    }
}
