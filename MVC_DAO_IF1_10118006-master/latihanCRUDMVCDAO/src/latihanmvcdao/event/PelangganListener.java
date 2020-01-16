/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.event;

import latihanmvcdao.entity.pelanggan;
import latihanmvcdao.model.PelangganModel;

/**
 * *Nama :Alfarizi Rizki Pane
 * NIM : 10118006
 * Kelas : IF-1 2018
 *
 * @author Alfarizi
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(pelanggan pelanggan);

    
    
}
