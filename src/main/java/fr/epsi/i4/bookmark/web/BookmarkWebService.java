package fr.epsi.i4.bookmark.web;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.epsi.i4.bookmark.Bookmark;
import fr.epsi.i4.bookmark.BookmarkRepository;

@WebService
public class BookmarkWebService {
	
	private BookmarkRepository repository = new BookmarkRepository();
	
	@WebResult(name="bookmark")
	public Bookmark createOrReplace (@WebParam(name="bookmark") Bookmark bookmark) {
		return null;
	}
	
	public void delete (@WebParam(name="bookmarkId") String id) {
	}
	
	public Bookmark get (@WebParam(name="bookmarkId") String id) {
		return null;
	}
}
