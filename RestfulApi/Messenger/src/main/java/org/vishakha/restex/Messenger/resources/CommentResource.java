package org.vishakha.restex.Messenger.resources;


import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vishakha.restex.Messenger.service.CommentService;
import org.vishakha.restex.Messenger.model.*;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	
//	@GET
//	public String test(){
//		return "testing sub resource";
//	}
	private CommentService cs=new CommentService();
	
	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageId){
		return cs.getAllComments(messageId);
	}
	
	@POST
	public Comment addComment(@PathParam("messageId") long messageId,Comment comment){
		return cs.addComment(messageId, comment);
	}
	
	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("commentId")long commentId,@PathParam("messageId") long messageId,Comment comment){
		comment.setId(commentId);
		return cs.updateComment(messageId, comment);
	}
	
	@DELETE
	@Path("/{commentId}")
	public void deleteComment(@PathParam("commentId")long commentId,@PathParam("messageId")long messageId){
		cs.removeComment(messageId, commentId);
	}

	@GET
	@Path("/{commentId}")
	public Comment getComment(@PathParam("commentId")long commentId,@PathParam("messageId")long messageId){
		return cs.getComment(messageId, commentId);
	}
	
}
