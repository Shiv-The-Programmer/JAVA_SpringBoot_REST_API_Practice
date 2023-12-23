package com.restdemo.JAVA_Cloud_Vendor.service.impl;

import com.restdemo.JAVA_Cloud_Vendor.model.CloudVendor;
import com.restdemo.JAVA_Cloud_Vendor.repository.CloudVendorRepository;
import com.restdemo.JAVA_Cloud_Vendor.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {

        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorID) {
        // More business logic
        cloudVendorRepository.deleteById(cloudVendorID);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorID) {
        return cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
