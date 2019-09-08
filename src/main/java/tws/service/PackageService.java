package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.Package;
import tws.repository.PackageMapper;

@Service
public class PackageService {
    @Autowired
    PackageMapper packageMapper;
	public void addPackages(Package packages) {
		packageMapper.insertPackage(packages);
		
	}
	public List<Package> getAllPackages() {
		return packageMapper.selectPackages();
	}
	
	public void updatePackage(Package packages) {
		packageMapper.updatePackage(packages);
	}

}
