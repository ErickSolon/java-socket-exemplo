package br.com.erickestudo;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1", 4444));

        var outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        outputStreamWriter.write("""
                
                
                                
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam imperdiet ante risus, a scelerisque sem euismod ac. Maecenas ac velit sodales, tincidunt arcu mollis, luctus mauris. Nunc congue orci non lacus egestas elementum. Ut pulvinar quis libero in porta. Cras sollicitudin mattis velit, nec euismod lacus convallis quis. Donec blandit sed nunc ac volutpat. Proin metus magna, accumsan eget aliquet in, vulputate vitae metus. Cras venenatis elementum felis, eget congue nisl suscipit et. Quisque eu risus finibus, elementum sem quis, volutpat ipsum. Maecenas venenatis quam eu tellus semper hendrerit. Mauris fringilla vel massa quis rutrum. Nullam eget lectus sed magna sagittis sagittis at euismod purus. Nunc vel justo lorem. Morbi leo massa, porttitor at lacinia in, luctus ac nulla. Morbi lacinia posuere urna, ut finibus tortor scelerisque vitae.
                                
                Etiam ultrices efficitur mi, nec laoreet sem. Sed nisi justo, fringilla nec magna eget, tincidunt euismod massa. Vivamus nec urna sed lectus varius hendrerit sit amet vitae tellus. Nulla facilisi. Sed euismod eget turpis sit amet aliquet. Vestibulum egestas neque vitae consequat interdum. Etiam ac scelerisque ipsum. Nunc orci lacus, facilisis ut auctor nec, sagittis vitae turpis. Nunc non fringilla nibh, non fringilla neque. Aenean eget sodales nibh. Nullam rutrum, nisl et volutpat vehicula, urna diam pulvinar mi, porttitor blandit leo risus vitae felis. Curabitur porttitor nisl turpis. Suspendisse ac ultricies velit. Pellentesque purus erat, lacinia vel iaculis quis, tristique sed nisi. Proin elementum id diam sed facilisis. Quisque faucibus euismod libero, in sollicitudin risus placerat et.
                                
                Nulla facilisi. Donec in porttitor massa. Duis at egestas enim. Etiam vestibulum vel quam hendrerit congue. Nullam pharetra lorem urna, vel dapibus nulla finibus eget. Donec ornare accumsan purus et ultrices. Nunc sed elementum odio. Nam ullamcorper tortor eget venenatis consectetur. Donec porttitor vestibulum nisl in posuere. Cras at purus at leo molestie vehicula. Proin ultricies tellus vel felis tincidunt pellentesque. Donec tempus volutpat urna at tincidunt. Integer pulvinar purus vel erat aliquam, vitae faucibus diam consequat. Nulla fringilla dapibus ipsum, eu interdum tellus porta sed. Cras volutpat augue quis nisl semper condimentum.
                                
                Suspendisse ultricies ligula quam, eu pellentesque velit accumsan quis. Quisque porta nibh a augue vulputate iaculis. Fusce gravida accumsan porttitor. Proin ut elit sit amet sem rutrum dapibus. Nam sem diam, cursus at consequat nec, placerat eget eros. Suspendisse potenti. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec id eros eros.
                                
                Vestibulum tempus suscipit gravida. Vestibulum tincidunt lectus ac velit scelerisque elementum. Duis sit amet lacinia velit. Aliquam hendrerit lacus vel turpis pulvinar lobortis. Integer dictum nec eros non commodo. Nam ut sagittis mi, sed facilisis nisi. Sed suscipit nulla neque. Suspendisse sem sapien, congue ut convallis et, luctus non purus. Curabitur a enim sed enim convallis pulvinar ut vitae nulla. Proin lacinia sodales tempor. Phasellus bibendum nulla nunc, vel auctor lectus ullamcorper id. Etiam mattis mattis purus vel sollicitudin. Phasellus convallis sollicitudin faucibus. Nulla id dictum nibh.\s
                """);
        outputStreamWriter.flush();

    }
}
