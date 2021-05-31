package com.nowcoder.community.dao;

import com.nowcoder.community.config.AlphaConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Repository("alphaImpl")
public class AlphaDaoImpl implements AlphaDao, ApplicationContextAware {

    @Autowired
    private AlphaConfig alphaConfig;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext =applicationContext;
    }


    @Override
    public String select() {
        SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
        return simpleDateFormat.format(new Date());

    }

}
