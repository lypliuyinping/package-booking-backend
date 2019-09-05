package tws.service;

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

}
