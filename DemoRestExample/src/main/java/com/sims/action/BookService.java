package com.sims.action;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("/book")
public class BookService {
	String json;
	BookAction b = new BookAction();

	@GET
	@Path("/{getListOfBooks}")
	@Produces("application/json")
	public String getBooksList() {
		ArrayList<BookVO> listOfBooks = b.listOfBooks();
		System.out.println(listOfBooks);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			json = gson.toJson(listOfBooks);
			System.out.println("ResultingJSONstring = " + json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	@GET
	@Path("/{getBookById}/{bookId}")
	@Produces("application/json")
	public String getBookById(@PathParam("bookId") int bookId) {
		BookVO bvo = b.getBookById(bookId);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		json = gson.toJson(bvo);
		return json;
	}

}