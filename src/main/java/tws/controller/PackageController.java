package tws.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Package;

import tws.service.PackageService;

@RestController
@RequestMapping("/packages")
public class PackageController {
    @Autowired
    PackageService packageService;
    
    @PostMapping
    public  ResponseEntity<Package> addPackage(@RequestBody  Package packages){
        packageService.addPackages(packages);
		return ResponseEntity.created(URI.create
				("/packages"+packages.getNumber())).build();
        
    }
    
    
    
}
