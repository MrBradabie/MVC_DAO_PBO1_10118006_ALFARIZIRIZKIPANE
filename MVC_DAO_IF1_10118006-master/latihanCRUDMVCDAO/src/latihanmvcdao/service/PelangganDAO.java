/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.service;

import java.util.List;
import latihanmvcdao.entity.pelanggan;
import latihanmvcdao.error.PelangganException;

/**
 * *Nama :Alfarizi Rizki Pane
 * NIM : 10118006
 * Kelas : IF-1 2018
 *
 * @author Alfarizi
 */
public interface PelangganDAO {
    
    public void insertPelanggan(pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(String email) throws PelangganException;
    public List<pelanggan> selectAllPelanggan() throws PelangganException;
    
}
