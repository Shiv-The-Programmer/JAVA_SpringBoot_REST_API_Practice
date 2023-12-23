package com.restdemo.JAVA_Cloud_Vendor.service;

import com.restdemo.JAVA_Cloud_Vendor.model.CloudVendor;
import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorID);
    public CloudVendor getCloudVendor(String cloudVendorID);
    public List<CloudVendor> getAllCloudVendors();

}
