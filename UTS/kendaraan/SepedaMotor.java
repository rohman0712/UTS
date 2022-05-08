package kendaraan;

import mesin.Mesin;

public class SepedaMotor
{
	private String bahan_bakar;
	private Mesin mesin;
	private String transmisi;

	private String nama;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return this.nama;
	}

	public void setBahan_bakar(String bahan_bakar)
	{
		this.bahan_bakar=bahan_bakar;
	}
	public String getBahan_bakar()
	{
		return this.bahan_bakar;
	}
	public void setMesin(Mesin mesin)
	{
		this.mesin=mesin;
	}
	public Mesin getMesin()
	{
		return this.mesin;
	}
	public void setTransmisi(String transmisi)
	{
		this.transmisi=transmisi;
	}
	public String getTransmisi()
	{
		return this.transmisi;
	}
}