package com.example.kuis_1718055;

class Keluarga {
    private String Nama, Umur, Status;
    private int Foto;

    public Keluarga (int foto, String nama, String umur, String status){
        this.Foto = foto;
        this.Nama = nama;
        this.Umur = umur;
        this.Status = status;
    }

    public int getFoto(){

        return Foto;
    }

    public String getNama(){

        return Nama;
    }

    public String getUmur(){

        return Umur;
    }

    public String getStatus(){

        return Status;
    }

}
