package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.InterruptibleChannel;

public class NIOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteBuffer buffer = ByteBuffer.allocate(48);
		RandomAccessFile f = new RandomAccessFile("/file.txt", "rw");
		FileChannel in = f.getChannel();

		int bytesRead = in.read(buffer);
	}

}
