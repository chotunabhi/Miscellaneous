package com.java.byteManips;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ByteToObject {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		List<ObjectModel> objectModels = new ArrayList<>();
		ObjectModel childModel = new ObjectModel();
		childModel.setI(2);
		childModel.setJ("1");
		objectModels.add(childModel);

		ObjectModel objectModel = new ObjectModel();
		objectModel.setI(1);
		objectModel.setJ("2");
		objectModel.setChilds(objectModels);

		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bo);
		oos.writeObject(objectModel);

		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bi);
		ObjectModel respObjectModel = (ObjectModel) ois.readObject();

		
	}

}
