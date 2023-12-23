package com.restdemo.JAVA_Cloud_Vendor.repository;

import com.restdemo.JAVA_Cloud_Vendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor,String>{
}
