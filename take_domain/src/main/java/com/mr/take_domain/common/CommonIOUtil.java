package com.mr.take_domain.common;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class CommonIOUtil {

	
	public static String uploadFile(MultipartFile imgFile,HttpServletRequest req,String path) {
		
		// 重命名文件
		String oldName = imgFile.getOriginalFilename();
		// 新名称
		String newName = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
		
		// 创建新文件夹
		File folder = new File(path);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		// 创建空文件
		File newFile = new File(path+"/"+newName);
		
		try {
			// 将文件写入到新文件中
			imgFile.transferTo(newFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path+"/"+newName;
	}
	
	/**
	 * <pre>readPic(读取图片)   
	 * 创建人：周佳倩 1836047979@qq.com    
	 * 创建时间：2019年5月25日 下午4:18:21    
	 * 修改人：周佳倩 1836047979@qq.com     
	 * 修改时间：2019年5月25日 下午4:18:21    
	 * 修改备注： 
	 * @param path
	 * @param resp</pre>
	 */
	public static void readPic(String path,HttpServletResponse resp) {
		FileInputStream fis = null;
		ServletOutputStream toClient= null;
		try {
			// 读入到流中
			fis = new FileInputStream(new File(path));
			int i = fis.available(); // 得到文件大小  
			byte data[] = new byte[i];  
			fis.read(data); // 读数据  
			fis.close();  
			resp.setContentType("image/*"); // 设置返回的文件类型  
			toClient = resp.getOutputStream(); // 得到向客户端输出二进制数据的对象  
			toClient.write(data); // 输出数据  
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=fis) {
					fis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null!= toClient) {
					toClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
