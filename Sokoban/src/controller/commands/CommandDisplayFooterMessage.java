package controller.commands;

import java.util.LinkedList;

import controller.server.SokoServer;
import view.FView;

public class CommandDisplayFooterMessage implements Command {

	
	private SokoServer server;
	private FView view;
	private LinkedList<String> params;
	
	public CommandDisplayFooterMessage(SokoServer server, FView view) {
		this.server=server;
		this.view=view;
	}
	@Override
	public void execute() {
		String line=params.removeFirst();
		if(server != null&& server != null)
			server.sendToClient(line);
		if(view !=null)
			view.displayFooterMessage(line);

	}

	@Override
	public void init(LinkedList<String> params) {
		if(params !=null)
			this.params=params;


	}

}
