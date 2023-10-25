package com.estore.entity;

// default package
// Generated Aug 23, 2020 8:16:43 AM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DonHang generated by hbm2java
 */
/**
 * @author ADMIN
 *
 */
@Entity
@Table(name = "DonHang")
public class DonHang implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer maDonHang;
	String ngayDatHang;
	String diaChi;
	String ghiChu;
	Double tongTien;

	@ManyToOne
	@JoinColumn(name = "maKhachHang")
	KhachHang khachHang;

	@OneToMany(mappedBy = "donHang", fetch = FetchType.EAGER)
	List<DonHangChiTiet> donHangChiTiets;

	public Integer getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(Integer maDonHang) {
		this.maDonHang = maDonHang;
	}

	public String getNgayDatHang() {
		return ngayDatHang;
	}

	public void setNgayDatHang(String dateFormat) {
		this.ngayDatHang = dateFormat;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Double getTongTien() {
		return tongTien;
	}

	public void setTongTien(Double tongTien) {
		this.tongTien = tongTien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public List<DonHangChiTiet> getDonHangChiTiets() {
		return donHangChiTiets;
	}

	public void setDonHangChiTiets(List<DonHangChiTiet> donHangChiTiets) {
		this.donHangChiTiets = donHangChiTiets;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
