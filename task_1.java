@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    assertEquals("возвращает true, если пользователю 18 лет или больше", true, isAdult);
}

