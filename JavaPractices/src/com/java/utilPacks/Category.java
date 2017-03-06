package com.java.utilPacks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable{
	int categoryId;
	int parentId;
	List<Category> categories = new ArrayList<Category>();
}
