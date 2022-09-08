package com.training.utils;

import java.lang.annotation.*;
import java.lang.reflect.Field;

import com.sun.corba.se.spi.transport.IIOPPrimaryToContactInfo;
import com.training.entity.Book;
import com.training.entity.Employee;
import com.training.entity.MyId;
import com.training.stereotypes.MyTable;


public class AnnotationProcessor {

	/*
	 * This method shoudl return the find by primary key query
	 * select * from employee where employeeId =?
	 */
	public String createQueryFindById(Object obj) {

		 String sql = null;
		
		
		String tableName = createSql(obj);
		
		
        MyId idRef;
		try {
			
			Field[] idRefs = obj.getClass().getDeclaredFields();
			
			String primaryKey =null;

			for(Field eachField : idRefs) {
				
				MyId ref =eachField.getAnnotation(MyId.class);
			
				if(ref !=null) {
					 primaryKey = ref.columnName();
	    			}
			}
				
			sql = tableName+ " where "+primaryKey+"=?";
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return sql;

	}
	
	public String createSql(Object obj) {
		
		String sql = null;
		
		
		MyTable tableRef =obj.getClass().getAnnotation(MyTable.class);
		
		String tableName = tableRef.name();
		
		sql = "select * from "+tableName;
		
		return sql;
		
	}
	
}
