clear

cam = webcam(1);

x=0;
y=0;
height=300;
width=300;

box=[x y height width];
snap = 1;
while snap <=300
    image=snapshot(cam);
    annoted_img = insertObjectAnnotation(image,'rectangle',box,'    Detection Area');   
    imshow(annoted_img);
    filename=strcat(num2str(snap),'.bmp');
    cropped_img=imcrop(annoted_img,box);
    processed_img=imresize(cropped_img,[227 227]);
    imwrite(processed_img,filename);
    snap=snap+1;
    drawnow;
end
clear cam;