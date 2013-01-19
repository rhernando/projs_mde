package exercise;

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
			
			//despuess...
					mxCell c_tProcess_pQueue = new mxCell();
					c_tProcess_pQueue.setEdge(true);
				//	c_tProcess_pQueue.setSource(t1_p2_p3);
				//	c_tProcess_pQueue.setTarget(p2);
				//	c_tProcess_pQueue.setStyle("startArrow=none;endArrow=none");
				//	graph.addCell(c_tProcess_pQueue);
			
			

			
			mxCell pBusy = new mxCell();
			pBusy.setValue("1");
			pBusy.setVertex(true);
			pBusy.setId("pBusy");
			pBusy.setGeometry(new mxGeometry(0, 0, 20, 20));
			pBusy.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pBusy);
			
			//despuess...
					mxCell c_tFinish_pBusy = new mxCell();
					c_tFinish_pBusy.setEdge(true);
				//	c_tFinish_pBusy.setSource(t1_p2_p3);
				//	c_tFinish_pBusy.setTarget(p2);
				//	c_tFinish_pBusy.setStyle("startArrow=none;endArrow=none");
				//	graph.addCell(c_tFinish_pBusy);
			
			

			
			mxCell pIdle = new mxCell();
			pIdle.setValue("0");
			pIdle.setVertex(true);
			pIdle.setId("pIdle");
			pIdle.setGeometry(new mxGeometry(0, 0, 20, 20));
			pIdle.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pIdle);
			
			//despuess...
					mxCell c_tProcess_pIdle = new mxCell();
					c_tProcess_pIdle.setEdge(true);
				//	c_tProcess_pIdle.setSource(t1_p2_p3);
				//	c_tProcess_pIdle.setTarget(p2);
				//	c_tProcess_pIdle.setStyle("startArrow=none;endArrow=none");
				//	graph.addCell(c_tProcess_pIdle);
			
			

			
			mxCell pExit = new mxCell();
			pExit.setValue("0");
			pExit.setVertex(true);
			pExit.setId("pExit");
			pExit.setGeometry(new mxGeometry(0, 0, 20, 20));
			pExit.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
			graph.addCell(pExit);
			
			//despuess...
					mxCell c_tDisposal_pExit = new mxCell();
					c_tDisposal_pExit.setEdge(true);
				//	c_tDisposal_pExit.setSource(t1_p2_p3);
				//	c_tDisposal_pExit.setTarget(p2);
				//	c_tDisposal_pExit.setStyle("startArrow=none;endArrow=none");
				//	graph.addCell(c_tDisposal_pExit);
			
			

