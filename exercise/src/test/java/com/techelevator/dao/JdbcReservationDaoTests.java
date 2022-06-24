package com.techelevator.dao;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class JdbcReservationDaoTests extends BaseDaoTests {

    private ReservationDao dao;

    @Before
    public void setup() {
        dao = new JdbcReservationDao(dataSource);
    }

    @Test
    public void createReservation_Should_ReturnNewReservationId() {
        int reservationCreated = dao.createReservation(1,
                "TEST NAME",
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3));

        assertEquals(5, reservationCreated);
    }

    @Test
    public void createReservation_Should_ReturnNewReservationId_2() {
        int reservationCreated = dao.createReservation(2,
                "TEST NAME 2",
                LocalDate.now().plusDays(2),
                LocalDate.now().plusDays(4));

        assertEquals(6, reservationCreated);
    }

}
