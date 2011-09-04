package com.aorm.model;

import com.aorm.core.annotation.Column;
import com.aorm.core.annotation.Table;
import com.aorm.core.constant.ColumnType;

@Table(name="Person")
public class Person {
    
    @Column(name = "id", type = ColumnType.INTEGER)
    public int id;
    
    @Column(name = "name", type = ColumnType.TEXT)
    public String name;
    
    @Column(name = "age", type = ColumnType.TEXT)
    public String age;
}
