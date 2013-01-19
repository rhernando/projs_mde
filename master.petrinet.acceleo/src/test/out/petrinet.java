package test.out;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.view.mxGraph;

public class VisualizePetriNet_Ejemplo {

	public static void main(String[] args) {
		mxGraph graph = new mxGraph();

			
			mxCell pQueue = new mxCell();
			pQueue.setValue("2");
			pQueue.setVertex(true);
			pQueue.setId("pQueue");
			pQueue.setGeometry(new mxGeometry(0, 0, 20, 20));
			pQueue.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pQueue);
			

			
			mxCell pBusy = new mxCell();
			pBusy.setValue("1");
			pBusy.setVertex(true);
			pBusy.setId("pBusy");
			pBusy.setGeometry(new mxGeometry(0, 0, 20, 20));
			pBusy.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pBusy);
			

			
			mxCell pIdle = new mxCell();
			pIdle.setValue("0");
			pIdle.setVertex(true);
			pIdle.setId("pIdle");
			pIdle.setGeometry(new mxGeometry(0, 0, 20, 20));
			pIdle.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pIdle);
			

			
			mxCell pExit = new mxCell();
			pExit.setValue("0");
			pExit.setVertex(true);
			pExit.setId("pExit");
			pExit.setGeometry(new mxGeometry(0, 0, 20, 20));
			pExit.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pExit);
			
			
				mxCell tArrival = new mxCell();
				tArrival.setValue("");
				tArrival.setVertex(true);
				tArrival.setId("tArrival");
				tArrival.setGeometry(new mxGeometry(0, 0, 10, 20));
				tArrival.setStyle(";shape=rectangle;strokeColor=black;fillColor=black;");
			
				graph.addCell(tArrival);
			
			

			
				mxCell tProcess = new mxCell();
				tProcess.setValue("");
				tProcess.setVertex(true);
				tProcess.setId("tProcess");
				tProcess.setGeometry(new mxGeometry(0, 0, 10, 20));
				tProcess.setStyle(";shape=rectangle;strokeColor=black;fillColor=black;");
			
				graph.addCell(tProcess);
			
			

			
				mxCell tFinish = new mxCell();
				tFinish.setValue("");
				tFinish.setVertex(true);
				tFinish.setId("tFinish");
				tFinish.setGeometry(new mxGeometry(0, 0, 10, 20));
				tFinish.setStyle(";shape=rectangle;strokeColor=black;fillColor=black;");
			
				graph.addCell(tFinish);
			
			

			
				mxCell tDisposal = new mxCell();
				tDisposal.setValue("");
				tDisposal.setVertex(true);
				tDisposal.setId("tDisposal");
				tDisposal.setGeometry(new mxGeometry(0, 0, 10, 20));
				tDisposal.setStyle(";shape=rectangle;strokeColor=black;fillColor=black;");
			
				graph.addCell(tDisposal);
			
			
			//conexiones 
				mxCell c_pQueue_tProcess = new mxCell();
				c_pQueue_tProcess.setEdge(true);
				c_pQueue_tProcess.setSource(pQueue);
				c_pQueue_tProcess.setTarget(tProcess);
				c_pQueue_tProcess.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_pQueue_tProcess);
			
			

			//conexiones 
				mxCell c_pBusy_tFinish = new mxCell();
				c_pBusy_tFinish.setEdge(true);
				c_pBusy_tFinish.setSource(pBusy);
				c_pBusy_tFinish.setTarget(tFinish);
				c_pBusy_tFinish.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_pBusy_tFinish);
			
			

			//conexiones 
				mxCell c_pIdle_tProcess = new mxCell();
				c_pIdle_tProcess.setEdge(true);
				c_pIdle_tProcess.setSource(pIdle);
				c_pIdle_tProcess.setTarget(tProcess);
				c_pIdle_tProcess.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_pIdle_tProcess);
			
			

			//conexiones 
				mxCell c_pExit_tDisposal = new mxCell();
				c_pExit_tDisposal.setEdge(true);
				c_pExit_tDisposal.setSource(pExit);
				c_pExit_tDisposal.setTarget(tDisposal);
				c_pExit_tDisposal.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_pExit_tDisposal);
			
			
				mxCell c_tArrival_pQueue = new mxCell();
				c_tArrival_pQueue.setEdge(true);
				c_tArrival_pQueue.setSource(tArrival);
				c_tArrival_pQueue.setTarget(pQueue);
				c_tArrival_pQueue.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_tArrival_pQueue);
			

				mxCell c_tProcess_pBusy = new mxCell();
				c_tProcess_pBusy.setEdge(true);
				c_tProcess_pBusy.setSource(tProcess);
				c_tProcess_pBusy.setTarget(pBusy);
				c_tProcess_pBusy.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_tProcess_pBusy);
			

				mxCell c_tFinish_pIdle = new mxCell();
				c_tFinish_pIdle.setEdge(true);
				c_tFinish_pIdle.setSource(tFinish);
				c_tFinish_pIdle.setTarget(pIdle);
				c_tFinish_pIdle.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_tFinish_pIdle);
			
				mxCell c_tFinish_pExit = new mxCell();
				c_tFinish_pExit.setEdge(true);
				c_tFinish_pExit.setSource(tFinish);
				c_tFinish_pExit.setTarget(pExit);
				c_tFinish_pExit.setStyle("startArrow=none;endArrow=none");
				graph.addCell(c_tFinish_pExit);
			

			
		new JGraphVisualizer().drawGraph(graph);
	}
}

