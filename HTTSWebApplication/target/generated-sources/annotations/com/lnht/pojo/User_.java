package com.lnht.pojo;

import com.lnht.pojo.Banner;
import com.lnht.pojo.Binhluanthongbao;
import com.lnht.pojo.Binhluanvideolivestream;
import com.lnht.pojo.Thongbaolivestream;
import com.lnht.pojo.Tintuyensinh;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-26T18:10:46", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Integer> role;
    public static volatile SetAttribute<User, Binhluanvideolivestream> binhluanvideolivestreamSet;
    public static volatile SetAttribute<User, Thongbaolivestream> thongbaolivestreamSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> hoten;
    public static volatile SetAttribute<User, Banner> bannerSet;
    public static volatile SetAttribute<User, Binhluanthongbao> binhluanthongbaoSet;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SetAttribute<User, Tintuyensinh> tintuyensinhSet;
    public static volatile SingularAttribute<User, String> username;

}