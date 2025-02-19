package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.Package;

@Mapper
public interface PackageMapper {

	 void insertPackage(@Param("packages") Package packages) ;
	 
//	 @Select("select * from packages")
	List<Package> selectPackages();

	void updatePackage(@Param("packages") Package packages);
}