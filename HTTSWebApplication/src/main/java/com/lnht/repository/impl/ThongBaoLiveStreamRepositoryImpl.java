/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnht.repository.impl;

import com.lnht.pojo.ThongBaoLivestream;
import com.lnht.repository.ThongBaoLiveStreamRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class ThongBaoLiveStreamRepositoryImpl implements ThongBaoLiveStreamRepository{
    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<ThongBaoLivestream> getThongBaoLivestreams() {
         Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM ThongBaoLivestream");
        
        return q.getResultList();
    }

    @Override
    public ThongBaoLivestream getThongBaoLivestreamById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(ThongBaoLivestream.class, id);
    }
    
}
