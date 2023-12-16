package meldexun.renderlib.util;

import javax.annotation.Nullable;

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.opengl.KHRDebugCallback;

import meldexun.renderlib.RenderLib;
import meldexun.renderlib.config.RenderLibConfig.OpenGLDebugOutput;

public enum OpenGLDebugMode {

	OpenGL43 {
		@Override
		public void enable(OpenGLDebugOutput openGLDebugOutput) {
		}

		@Override
		public void disable() {
		}

		@Override
		protected void log(int source, int type, int id, int severity, String message) {
		}

		@Override
		protected String getSource(int source) {
			return "none";

		}

		@Override
		protected String getType(int type) {
			return "none";
			
		}

		@Override
		protected String getSeverity(int severity) {
			return "none";
		}

	},
	KHR {
		@Override
		public void enable(OpenGLDebugOutput openGLDebugOutput) {
		}

		@Override
		public void disable() {
		}

		@Override
		protected void log(int source, int type, int id, int severity, String message) {
		}

		@Override
		protected String getSource(int source) {
return "none";
		}

		@Override
		protected String getType(int type) {
return "none";
		}

		@Override
		protected String getSeverity(int severity) {
return "none";
		}

	};

	@Nullable
	public static OpenGLDebugMode getSupported() {
		return null;
	}

	public abstract void enable(OpenGLDebugOutput openGLDebugOutput);

	public abstract void disable();

	protected abstract void log(int source, int type, int id, int severity, String message);

	protected void throwGLException(int source, int type, int id, int severity, String message) {
	}

	protected void logDebugMessage(int source, int type, int id, int severity, String message) {
	}

	protected abstract String getSource(int source);

	protected abstract String getType(int source);

	protected abstract String getSeverity(int source);

}
