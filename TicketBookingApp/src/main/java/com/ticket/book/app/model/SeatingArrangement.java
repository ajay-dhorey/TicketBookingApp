package com.ticket.book.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SEATING_ARRANGEMENT")
public class SeatingArrangement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seatId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="THEATER_ID")
	private Theater theater;
	
	
	@Column(name="ROW_NUM")
	private int rowNum;
	
	
	@Column(name="COLUMN_NUM")
	private Theater columnNum;
	
	@Column(name="SEAT_TYPE")
	private SeatType seatType;
	
	@Column(name="ROW_NAME")
	private String rowName;
	
	@Column(name="SEAT_NO")
	private int seatNo;
	
	public static enum SeatType {
		EMPTY_SPACE,
		SILVER,
		GOLD,
		PLATINUM,
		DIAMOND
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public Theater getColumnNum() {
		return columnNum;
	}

	public void setColumnNum(Theater columnNum) {
		this.columnNum = columnNum;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public String getRowName() {
		return rowName;
	}

	public void setRowName(String rowName) {
		this.rowName = rowName;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}


	
	
	
	
	
	
}
