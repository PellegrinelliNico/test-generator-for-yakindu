package javareading;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * The Class MethodDeclarationVisitor.
 */
public class MethodDeclarationVisitor extends VoidVisitorAdapter<Void> {

	/**
	 * Visit a method declaration, set the visibility to private if it is protected
	 * or if it is a public set method.
	 *
	 * @param the method declaration
	 * @param arg none
	 */
	@Override
	public void visit(MethodDeclaration node, Void arg) {
		// To ensure child nodes of the current node are also visited
		super.visit(node, arg);
		// Changes method visibility from protected to private
		if (node.isProtected()) {
			node.setProtected(false);
			node.setPrivate(true);
		}
		// Changes method visibility from public to private if it is a set or get method
		if (node.isPublic() && (node.getNameAsString().startsWith("set") || node.getNameAsString().startsWith("get"))) {
			node.setPublic(false);
			node.setPrivate(true);
		}
	}

}
