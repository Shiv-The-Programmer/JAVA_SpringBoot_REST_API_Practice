package com.restdemo.JAVA_Cloud_Vendor.controller;

import com.restdemo.JAVA_Cloud_Vendor.model.CloudVendor;
import com.restdemo.JAVA_Cloud_Vendor.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    // Get specific cloud vendor details
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        //return new CloudVendor("C1","CloudVendor1","Cloud_Address1","12345");
        return cloudVendorService.getCloudVendor(vendorID);
    }
    // Get all cloud vendor details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        //return a list of all cloud vendors
        return cloudVendorService.getAllCloudVendors();
    }
    // Create Cloud Vendor Details
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        this.cloudVendorService.deleteCloudVendor(vendorID);
        return "Cloud Vendor deleted successfully";
    }
}
