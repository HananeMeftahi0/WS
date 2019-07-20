/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ws;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author hanane
 */
@WebService()
public class DisplayAverage {

    /**
     * Web service operation
     */
  

    @WebMethod(operationName = "avCourse")
    public double avCourse(@WebParam(name = "id")
    int id, @WebParam(name = "course")
    String course)  {
        double av=0;


          PreparedStatement pstmt=null;
          ResultSet rs=null;
          Connection conn;
          conn=(Connection) Connec.connectionDB();


        try {
           pstmt=(PreparedStatement) conn.prepareStatement("SELECT * from courses where Course='"+course+"' and Id_student="+id);

          rs=(ResultSet) pstmt.executeQuery();
            while(rs.next()){
                av=rs.getDouble("Note");
            System.out.println(av);

            }

        } catch (Exception ex) {
                System.out.println("error");

        }
        return av;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "generalAverage")
    public /*List<String>*/ double generalAverage(@WebParam(name = "id")
    int id)  {

       double n=0,avG=0;
         int c=1,cs=1;

       String f=null,l=null,full=null;

        List<String> list = new ArrayList<String>();

          PreparedStatement pstmt=null;
          ResultSet rs=null;

          Connection conn;
          conn=(Connection) Connec.connectionDB();


       try {
           pstmt=(PreparedStatement) conn.prepareStatement("SELECT Note,coeff from courses where Id_Student="+id);

          rs=(ResultSet) pstmt.executeQuery();

            while(rs.next()){

               // cs=rs.getInt("s");


                n=rs.getDouble("Note");
                c=rs.getInt("coeff");
                 avG=(n*c)+avG;
                 System.out.println(n+"x"+c+"="+avG);



            }

        } catch (Exception ex) {
                System.out.println("error");

        }finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DisplayAverage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        full=f+" "+l;
System.out.println(cs);
System.out.println(avG);

  conn=(Connection) Connec.connectionDB();

   try {
           pstmt=(PreparedStatement) conn.prepareStatement("SELECT sum(coeff) as s from courses where Id_Student="+id);

          rs=(ResultSet) pstmt.executeQuery();

            while(rs.next()){

               cs=rs.getInt("s");
               System.out.println(cs);


            }

        } catch (Exception ex) {
                System.out.println("error");

        }finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DisplayAverage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         conn=(Connection) Connec.connectionDB();

   try {
           pstmt=(PreparedStatement) conn.prepareStatement("SELECT firstname,lastname  from students where Id="+id);

          rs=(ResultSet) pstmt.executeQuery();

            while(rs.next()){

               f=rs.getString("firstname");
               l=rs.getString("lastname");



            }

        } catch (Exception ex) {
                System.out.println("error");

        }finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DisplayAverage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        full=f+" "+l;
  list.add(full);
  list.add(Double.toString(avG/cs));
return avG/cs;

    }

}
