
package com.luxmart.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

//https://www.youtube.com/watch?v=5K6NNX-GGDI? lombok install
@Data
public class User implements Serializable {
	private final static long serialVersionUID = 270727596527329664L;
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   


}
