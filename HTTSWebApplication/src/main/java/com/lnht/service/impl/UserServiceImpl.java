/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnht.service.impl;

import com.lnht.utils.FileUtils;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lnht.pojo.User;
import com.lnht.repository.UserRepository;
import com.lnht.service.UserService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author minh-nguyen
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getUsers(Map<String, String> params) {
        return userRepo.getUsers(params);
    }

    @Override
    public void addOrUpdateUser(User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        
//        // user.getFile()
//        if ("".equals(user.getFile().getOriginalFilename()) == false) {
//            try {
//                MultipartFile file = user.getFile();
//                String fileName = file.getOriginalFilename();
////                /home/minh-nguyen/projects/hotrotuyensinh_project/AdmissionSupportSystem/admissionsupport_backend_v1/src/main/webapp
////                String rootDir = request.getSession()
////                        .getServletContext().getRealPath("/");
//                file.transferTo(new File("/home/minh-nguyen/projects/hotrotuyensinh_project/AdmissionSupportSystem/admissionsupport_backend_v1/src/main/webapp/resources/images/" + fileName));
//                session.setAttribute("image-file", file.getOriginalFilename());
//                
//                user.setAvatar(FileUtils.findAvatarPath(file.getOriginalFilename()));
//            } catch (IOException | IllegalStateException ex) {
//                Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }else{
//            if(user.getId().isEmpty()==false){
//                String fileName = (String) session.getAttribute("image-file");
//                
//                user.setAvatar(FileUtils.findAvatarPath(fileName));
//            }
//        }

        userRepo.addOrUpdateUser(user);

    }

    @Override
    public int countUser() {
        return this.userRepo.countUser();
    }

    @Override
    public User getUserById(String id) {
        return this.userRepo.getUserById(id);
    }

    @Override
    public void deleteUser(String id) {
        this.userRepo.deleteUser(id);
    }

}