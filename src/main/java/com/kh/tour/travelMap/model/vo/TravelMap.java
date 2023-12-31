package com.kh.tour.travelMap.model.vo;


import java.util.List;

import com.kh.tour.tour.model.vo.RepeatCourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelMap { //공통정보 테이블 = main 
	private int contentId;         //콘텐츠ID         
	private int contentTypeId;     //콘텐츠타입ID       
	private String contentTypeName;     //콘텐츠타입name       
	private String title;          //콘텐츠명(제목)         
	private String tel;            //전화번호             
	private String homePage;       //홈페이지주소           
	private String firstImage;     //대표이미지 (원본)       
	private String addr1;          //주소               
	private String mapX;           //GPS X좌표          
	private String mapY;           //GPS Y좌표          
	private String overview;       //개요  
	private int star;
	
	private String 	distance; 
	private String 	schedule; 
	private String 	takeTime; 
	private int 	subNum; 
	private int 	subcontentId; 
	private String 	subName;
	private String 	subdetailImg;
	private List<RepeatCourse> course;
	
}









































