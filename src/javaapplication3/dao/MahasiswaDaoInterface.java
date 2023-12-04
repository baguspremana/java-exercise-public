/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication3.dao;

import java.util.List;
import javaapplication3.models.Mahasiswa;

/**
 *
 * @author admin
 */
public interface MahasiswaDaoInterface {
    
    public void insert(Mahasiswa m);
    
    public void update(Mahasiswa m);
    
    public void delete(Integer id);
    
    public List<Mahasiswa> all();
    
    public List<Mahasiswa> search(String keyword);
}
