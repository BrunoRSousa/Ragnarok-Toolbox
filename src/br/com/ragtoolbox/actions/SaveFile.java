package br.com.ragtoolbox.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Environment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class SaveFile {
	
	public void takeAScreenShot (Activity act, View view, String customName){
		final String DIR = "RagnarokToolbox" + File.separator + "Skills";
		
		File sdCard = new File(Environment.getExternalStorageDirectory(), DIR);
		if(!sdCard.exists()) sdCard.mkdirs();
		
		File[] fileList = sdCard.listFiles();
		int nFiles = 0;
		for(File f: fileList){
			nFiles++;
		}
		
		String fileName = nFiles + "_" + customName + ".png";
		
		Toast.makeText(act, "Salvando PNG...", Toast.LENGTH_SHORT).show();
		Bitmap img = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
		Canvas canv = new Canvas(img);
		view.draw(canv);
		File arq = new File(sdCard, fileName);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(arq);
			img.compress(CompressFormat.PNG, 100, fos);
			Toast.makeText(act, "Salvo em: RagnarokToolbox/Skills/", Toast.LENGTH_LONG).show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Toast.makeText(act, "Desculpe, ocorreu um erro!", Toast.LENGTH_LONG).show();
		}
	}
	
}
