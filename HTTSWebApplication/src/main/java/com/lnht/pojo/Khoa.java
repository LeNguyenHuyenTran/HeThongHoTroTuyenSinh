/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnht.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "khoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoa.findAll", query = "SELECT k FROM Khoa k"),
    @NamedQuery(name = "Khoa.findById", query = "SELECT k FROM Khoa k WHERE k.id = :id"),
    @NamedQuery(name = "Khoa.findByTenKhoa", query = "SELECT k FROM Khoa k WHERE k.tenKhoa = :tenKhoa")})
public class Khoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ten_khoa")
    private String tenKhoa;
    @Lob
    @Size(max = 65535)
    @Column(name = "video")
    private String video;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "khoa1")
    private Set<DiemTrungTuyen> diemTrungTuyenSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "khoa")
    private Set<Nganh> nganhSet;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ThongTin thongTin;

    public Khoa() {
    }

    public Khoa(Integer id) {
        this.id = id;
    }

    public Khoa(Integer id, String tenKhoa) {
        this.id = id;
        this.tenKhoa = tenKhoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @XmlTransient
    public Set<DiemTrungTuyen> getDiemTrungTuyenSet() {
        return diemTrungTuyenSet;
    }

    public void setDiemTrungTuyenSet(Set<DiemTrungTuyen> diemTrungTuyenSet) {
        this.diemTrungTuyenSet = diemTrungTuyenSet;
    }

    @XmlTransient
    public Set<Nganh> getNganhSet() {
        return nganhSet;
    }

    public void setNganhSet(Set<Nganh> nganhSet) {
        this.nganhSet = nganhSet;
    }

    public ThongTin getThongTin() {
        return thongTin;
    }

    public void setThongTin(ThongTin thongTin) {
        this.thongTin = thongTin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khoa)) {
            return false;
        }
        Khoa other = (Khoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lnht.pojo.Khoa[ id=" + id + " ]";
    }
    
}
