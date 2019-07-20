/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ws2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.ws.Connec;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author hanane
 */
@WebService()
public class AdmittedOrNot {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AON")
    public boolean AON(@WebParam(name = "id")
    int id) {



          PreparedStatement pstmt=null;
          ResultSet rs=null;
          Connection conn;
          conn=(Connection) Connec.connectionDB();
          String a=null;


        try {
           pstmt=(PreparedStatement) conn.prepareStatement("SELECT * from students where Id="+id);

          rs=(ResultSet) pstmt.executeQuery();
            while(rs.next()){
        a=rs.getString("Eval");

            }

        } catch (Exception ex) {
                System.out.println("error");

        }
          if(a.equals("admitted with bebts"))return true;
          else return false;


    }

}
