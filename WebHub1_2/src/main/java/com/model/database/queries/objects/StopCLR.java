// Copyright (C) 2015 Oregon State University - School of Mechanical,Industrial and Manufacturing Engineering 
//   This file is part of Transit Network Analysis Software Tool.
//
//    Transit Network Analysis Software Tool is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Transit Network Analysis Software Tool is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU  General Public License for more details.
//
//    You should have received a copy of the GNU  General Public License
//    along with Transit Network Analysis Software Tool.  If not, see <http://www.gnu.org/licenses/>.


package com.model.database.queries.objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement(name = "StopCLR")
public class StopCLR {
	
	
	@XmlAttribute
    @JsonSerialize
	public String agencyId;
	
	@XmlAttribute
    @JsonSerialize
	public String cName;
	
	@XmlAttribute
    @JsonSerialize
	public String uName;
	
	@XmlAttribute
    @JsonSerialize
	public String rName;
	
	@XmlAttribute
    @JsonSerialize
	public String region;
	
	@XmlAttribute
    @JsonSerialize
	public String uPop;
	
	@XmlAttribute
    @JsonSerialize
	public String lat;
	
	@XmlAttribute
    @JsonSerialize
	public String lon;
	
	@XmlAttribute
    @JsonSerialize
	public String stopId;
	
	@XmlAttribute
    @JsonSerialize
    public String stopName;
	
	@XmlAttribute
    @JsonSerialize
    public String realAgencyIds;
	
	@XmlAttribute
    @JsonSerialize
	public String aNames;
	
	@XmlAttribute
    @JsonSerialize
    public String routeIds;
	
	@XmlAttribute
    @JsonSerialize
    public String services;	
}
