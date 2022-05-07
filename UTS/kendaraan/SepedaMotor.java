package kendaraan;
public class SepedaMotor
{
	private String bahan_bakar;
	private String mesin;
	private String transmisi;
	
	public void setBahan_bakar(String bahan_bakar)
	{
		this.bahan_bakar=bahan_bakar;
	}
	public String getBahan_bakar()
	{
		return this.bahan_bakar;
	}
	public void setMesin(String mesin)
	{
		this.mesin=mesin;
	}
	public String getMesin()
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