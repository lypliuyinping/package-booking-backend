package tws.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Package;

import tws.service.PackageService;
@CrossOrigin
@RestController
@RequestMapping("/packages")

public class PackageController {
    @Autowired
    PackageService packageService;
    
    //提交包裹信息
    @PostMapping
    public  ResponseEntity<Package> addPackage(@RequestBody  Package packages){
        packageService.addPackages(packages);
		return ResponseEntity.created(URI.create
				("/packages"+packages.getNumber())).build();
        
    }
    //获取信息
    @GetMapping
    public ResponseEntity<List<Package>> getAllPackages(){
        return ResponseEntity.ok(packageService.getAllPackages());
    }
    //修改
    @PutMapping
    public ResponseEntity<Package> updatePackage(@RequestBody Package packages){
        packageService.updatePackage(packages);
        return ResponseEntity.ok(packages);
    }
    
}
