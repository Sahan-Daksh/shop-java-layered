package com.dev.pos.dao;

import com.dev.pos.db.DBConnection;
import com.dev.pos.dto.CustomerDTO;
import com.dev.pos.dto.ProductDTO;
import com.dev.pos.dto.UserDTO;
import com.dev.pos.util.security.PasswordManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseAccessCode {

    //.................User....Start...

    public static boolean createUser(UserDTO userDTO) throws SQLException, ClassNotFoundException {

    }

    public static UserDTO findUser(String email) throws SQLException, ClassNotFoundException {

    }

    //.................User.....End...

    //.....Customer...Start....

    public static boolean createCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {


    }

    public static boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {



    }

    public static boolean deleteCustomer(String email) throws SQLException, ClassNotFoundException {


    }

    public static CustomerDTO findCustomer(String email) throws SQLException, ClassNotFoundException {


    }

    public static List<CustomerDTO> findAllCustomer() throws SQLException, ClassNotFoundException {


    }

    public static List<CustomerDTO> searchCustomer(String searchText) throws SQLException, ClassNotFoundException {


    }


    //.....Customer....End....


    //Product....Start...

    public static int getLastProductId() throws SQLException, ClassNotFoundException {

    }

    public static boolean saveProduct(ProductDTO dto) throws SQLException, ClassNotFoundException {

    }

    public static boolean updateProduct(ProductDTO dto) throws SQLException, ClassNotFoundException {

    }

    public static boolean deleteProduct(int code) throws SQLException, ClassNotFoundException {

    }

    public ProductDTO findProduct(int code) throws SQLException, ClassNotFoundException {

    }

    public List<ProductDTO> findAllProduct() throws SQLException, ClassNotFoundException {

    }

    public List<ProductDTO> searchProduct(String searchText) throws SQLException, ClassNotFoundException {

    }

    //Product....End...

}
